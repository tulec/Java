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
    public static void main(String args[]){
        int arr[] = {1,4,3,3,2,6,7,8,4,3,1};
        for (int i = 0; i < 11; i++){
            System.out.print(arr[i] + " ");
        }
    }
}