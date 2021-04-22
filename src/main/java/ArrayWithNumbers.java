import  java.io.*;
import  java.math.*;

/**
 * Класс создающий массив размером 20 при создании эксземпляра класса и обладающий методом FindAndReplace для поиска и замены элементов массива
 */
public class ArrayWithNumbers {

    int PosMin = 10;
    int PosMinI;
    int NegMax = 0;
    int NegMaxI;
    int array[]=new int[20];

    public ArrayWithNumbers()
    {
        for (int i = 0; i < array.length; i++) {
            array[i]=rnd(-10,10);
            System.out.print(array[i]+" ");
        }
    }

    /**
     * Ищем в массиве и меняем местами наименьший положительный элемент и наибольший отрцательный
     */
    public void FindAndReplace()
    {
        for (int i = 0; i < array.length; i++) {
            //Ищем наименьший положительный (значение + позицию)
            if (array[i]>0&&PosMin>array[i]){
                PosMin=array[i];
                PosMinI=i;
            }
            //Ищем наибольший отрицательный (значение + позицию)
            if (NegMax>array[i]){
                NegMax=array[i];
                NegMaxI=i;
            }
        }

        //выводим найденные наименьший положительный (значение + позицию) и наибольший отрицательный (значение + позицию)
        System.out.println();
        System.out.println("NegMax "+array[NegMaxI]+" at "+(NegMaxI+1));
        System.out.println("PosMin "+array[PosMinI]+" at "+(PosMinI+1));


        //меняем наибольший отрицательный и наименьший положительный местами
        array[PosMinI]=NegMax;
        array[NegMaxI]=PosMin;
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }

    }

    /**
     * Метод для получения рандомных чисел в заданном диапазоне
     * @param min нижняя граница диапазона
     * @param max верхняя граница диапазона
     * @return возвращает целое число
     */
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
