package com.harbor.thread;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

public class ForkJoinTaskDemo {
    public static void main(String[] args) throws InterruptedException {
        int length = 10;
        int[] data = (new Data(length)).getData();
        printArr(data);
        System.out.println("----------------");

        int[] result = new int[data.length];

        //Fork/Join 从这里开始
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTaskDemo.mergeTask task = new ForkJoinTaskDemo.mergeTask(data, result, 0, data.length - 1);//创建任务
        forkJoinPool.execute(task);//执行任务
        forkJoinPool.awaitTermination(2, TimeUnit.SECONDS);//阻塞当前线程直到pool中的任务都完成了

        printArr(data);
        System.out.println();
        verify(data);

    }

    /**
     *
     * @param nums
     * @param tmp
     * @param left
     * @param right
     */
    private static void mergeSort(int[] nums, int[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(nums, tmp, left, center);
            mergeSort(nums, tmp, center + 1, right);
            merge(nums, tmp, left, center + 1, right);
        }
    }

    /**
     *
     * @param data
     * @param result
     * @param leftPos
     * @param rightPos
     * @param rightEnd
     */
    private static void merge(int[] data, int[] result, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (data[leftPos] < data[rightPos]) {
                result[tmpPos] = data[leftPos];
                leftPos++;
            } else {
                result[tmpPos] = data[rightPos];
                rightPos++;
            }
            tmpPos++;
        }

        while (leftPos <= leftEnd) {
            result[tmpPos++] = data[leftPos++];
        }

        while (rightPos <= rightEnd) {
            result[tmpPos++] = data[rightPos++];
        }

        for (int i = 0; i < numElements; i++, rightEnd--) {
            data[rightEnd] = result[rightEnd];
        }

        System.out.println(Thread.currentThread().getName() + " merge left = "+leftPos+", right = "+rightPos+", rightEnd = "+ rightEnd);
        System.out.println(Thread.currentThread().getName() + " data   ==> " + Arrays.toString(data));
        System.out.println(Thread.currentThread().getName() + " result ==> " + Arrays.toString(result));
    }

    //打印
    public static void printArr(int[] arr) {
//        for (int i : arr) {
//            System.out.println(i + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }

    public static void verify(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                System.out.println("排序失败");
                return;
            }

        }
        System.out.println("排序成功");
    }

    static class mergeTask extends RecursiveAction {

        private static final int THRESHOLD = 2;//设置任务大小阈值
        private int start;
        private int end;
        private int[] data;
        private int[] tmp;

        public mergeTask(int[] data, int[] tmp, int start, int end) {
            System.out.println(Thread.currentThread().getName() + " Creating sub task with start = "+start+", end = "+end);
            this.data = data;
            this.tmp = tmp;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {

            System.out.println(Thread.currentThread().getName() + " computing");


            if ((end - start) <= THRESHOLD) {
                mergeSort(data, tmp, start, end);
            } else {
                int center = (start + end) / 2;
                ForkJoinTaskDemo.mergeTask leftTask = new ForkJoinTaskDemo.mergeTask(data, tmp, start, center);
                ForkJoinTaskDemo.mergeTask rightTask = new ForkJoinTaskDemo.mergeTask(data, tmp, center + 1, end);

                leftTask.fork();
                rightTask.fork();

                leftTask.join();
                rightTask.join();

                merge(data, tmp, start, center + 1, end);

            }
        }
    }

}


/**
 * 产生随机数据
 */
class Data {
    int length;
    int[] data;

    public Data(int length) {
        this.length = length;
        data = new int[length];
    }

    public int[] getData() {

        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < length; i++) {
            data[i] = random.nextInt(2 * length);
        }
        return data;
    }


}