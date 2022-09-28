public class Arrays {
  public static void main(String [] args)
  {
   long[] arr;                             // Ссылка на массив
   arr = new long[100];                    // Создание массива
   int nElms;                              // Количество элементов
   int j;                                  // Счетчик цикла
   long searchKey;                         // Ключи искомого элемента
//-----------------------------------------------------------------------------------------
   arr[0] = 77;                            // Вставка 10 элементов
   arr[1] = 99;
   arr[2] = 44;
   arr[3] = 55;
   arr[4] = 22;
   arr[5] = 88;
   arr[6] = 11;
   arr[7] = 15;
   arr[8] = 66;
   arr[9] = 33;
   nElms = 10;                           // Массив содержит 10 элементов
//-----------------------------------------------------------------------------------------
   for (j=0; j<nElms; j++)               // Вывод элементов
       System.out.print(arr[j] + " ");
   System.out.print("");
//-----------------------------------------------------------------------------------------
   searchKey = 66;                                     // Поиск элемента с ключем 66
   for (j=0; j<nElms; j++)                            // Для каждого элемента
       if (arr[j] == searchKey)                        // Значение найдено?
           break;                                      // Да - выход из цикла
   if (j==nElms)                                      // Достигнут последний элемент?
       System.out.println("Can't find " + searchKey);  // Да
   else
       System.out.println("Found " + searchKey);       // Нет
//------------------------------------------------------------------------------------------
   searchKey = 55;                                     // Удаление элемента с ключом 55
   for (j=0; j<nElms; j++)                            // Поиск удоляемого элемента
       if (arr[j] == searchKey)
           break;
   for (int k=j; k<nElms-1; k++)                      // Сдвиг последующих элементов
       arr[k] = arr[k+1];
   nElms--;                                           // Уменьшения размера
//------------------------------------------------------------------------------------------
   for (j=0; j<nElms; j++)                            // Вывод элементов
       System.out.print( arr[j] + " ");
   System.out.println(" ");
  }
}
