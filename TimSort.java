//  Этот файл создан только для того , чтобы я не забывал что я прочитал.

class trivial{

    int block = 32; // размер блока

    public static void inSort(int arr[],int left, int right){ // сортировка вставками
        for (int i = left + 1; i < right; i++){
            int temp = arr[i];
        int j = i - 1;
        while (arr[j] > temp && j >= left)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
        }
    }
    public static void merge(int arr[], int l, int m, int r){  // функция слияния объединяет отсортированные блоки
        // исходный массив разбит на две части
    // левый и правый массив
    int len1 = m - l + 1, len2 = r - m;
    int left[len1], right[len2];
    for (int i = 0; i < len1; i++)
        left[i] = arr[l + i];
    for (int i = 0; i < len2; i++)
        right[i] = arr[m + 1 + i];
    int i = 0;
    int j = 0;
    int k = l;
    // после сравнения мы объединяем эти два массива
    // в большем подмассиве
    while (i < len1 && j < len2)
    {
        if (left[i] <= right[j])
        {
            arr[k] = left[i];
            i++;
        }
        else
        {
            arr[k] = right[j];
            j++;
        }
        k++;
    }
    while (i < len1) // копируем оставшиеся элементы left, если есть
    {
        arr[k] = left[i];
        k++;
        i++;
    }
    while (j < len2) // копируем оставшийся элемент right, если есть
    {
        arr[k] = right[j];
        k++;
        j++;
    }
}


    
    public static void main(String args[]){
        int arr[] = {1,4,3,3,2,6,7,8,4,3,1};
        for (int i = 0; i < 11; i++){
            System.out.print(arr[i] + " ");
        }
    }
}