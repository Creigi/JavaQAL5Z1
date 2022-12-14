package ru.netology.sqr;

public class SQRService {

//    проба через встроенные методы
//    public int countOfSqr (int lowLimit, int topLimit) {
//        int start = (int) Math.ceil(Math.sqrt((double)lowLimit));
//        int stop = (int) Math.floor(Math.sqrt((double)topLimit));
//        int x = stop - start + 1;
//        return x;
//    }

    public int countOfSqrFor (int lowLimit, int topLimit){
        int count = 0;
        for (int i = 10; i < 100; i++){
            if (i * i >= lowLimit && i * i <= topLimit) {
                count++;
            }
        }
        return count;
    }
}
