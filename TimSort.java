//  Этот файл создан только для того , чтобы я не забывал что я прочитал.

class trivial{

    public static void inSort(int arr[],int left, int right){ // сортировка вставками
        for (int i = left + 1; i < right; i++){
            int temp = arr[i];
        int j = i - 1;
        while (arr[j] > temp && j >= left){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
        }
    }
    public static void merge(int arr[], int l, int m, int r){  // функция слияния объединяет отсортированные блоки
        int len1 = m - l + 1, len2 = r - m;         // исходный массив разбит на две части
        int left[len1], right[len2];
        for (int i = 0; i < len1; i++)
            left[i] = arr[l + i];
        for (int i = 0; i < len2; i++)
            right[i] = arr[m + 1 + i];
        int i = 0;
        int j = 0;
        int k = l;
        while (i < len1 && j < len2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
            arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < len1){ // копируем оставшиеся элементы left, если есть
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < len2){ // копируем оставшийся элемент right, если есть
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    
    public static void TimSort(int arr[], int n){
        int block = 32; // итеративная функция Timsort для сортировки массива [0 ... n-1] (аналог сортировки слиянием)
        for (int i = 0; i < n; i += RUN) // Сортировка отдельных подмассивов по размеру блока
            insertionSort(arr, i, min((i + 31), (n - 1)));
        for (int size = block; size < n; size = 2 * size){ // начинаем слияние с размера блоrа (или 32). Будет сливаться сформировать размер 64, затем 128, 256 и т. д.
        // Берем начальную точку левого подмассива. Мы
        // собираемся объединить arr [left..left + size-1]
        // и arr [left + size, left + 2 * size-1]
        // После каждого слияния мы увеличиваем left на 2 * размер
        for (int left = 0; left < n; left += 2 * size){
            // находим конечную точку левого подмассива
            // mid + 1 - начальная точка правого подмассива
            int mid = left + size - 1;
            int right = min((left + 2 * size - 1), (n - 1));
            // объединяем подмассив arr [left ..... mid] &
            // arr [mid + 1 .... right]
            merge(arr, left, mid, right);
            }
        }
    }

    public static void  printarr(int arr[]){
        for (int i = 0; i < 11; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]){
        int arr[] = {1,4,3,3,2,6,7,8,4,3,1};
        System.out.print("Начальный массив");
        printarr(arr);
        TimSort(arr);
        System.out.print("Отсоритрованный массив");
        printarr(arr);
    }
}