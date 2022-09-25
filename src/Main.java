public class Main {
    public static void main(String[] args) {
        int[][] massive = new int[4][4];   //объявление двумерного массива размерностью 4 на 4
        for (int i = 0; i < massive.length; i++) {   //цикл для выделения памяти для каждого подмассива
            massive[i] = new int[4];   //выделение памяти под один массив
        }
        for (int i = 0; i < massive.length; i++) {   //цикл для первого индекса массива
            for (int l = 0; l < massive.length; l++) {   //цикл для второго индекса массива
                massive[i][l] = 0;   //рисваиваем элементу двухмерного массива значение 0
            }
        }
        for (int i = 0; i < massive.length; i++) {   //цикл для первого индекса массива
            for (int l = 0; l < massive.length; l++) {   //цикл для второго индекса массива
                System.out.println("massive[" + i + "][" + l + "] = " + massive[i][l]);   //вывод на экран значения элемента двумерного массива
            }
        }
    }
}
