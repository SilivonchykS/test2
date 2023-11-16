package classwork.last_homework.homework28;

public class MyArray28 {
        private double[]array;
       // public MyArray(){
       //     array=new double[0];
       // }
       // public MyArray(double[]array){
        //    this.array=new double[array.length];
        //    copy(array,this.array);
       // }
        private void copy(double[]src, double[]dst){
            for (int i=0;i<src.length;i++){
                dst[i]=src[i];
            }
        }
        public double get(int index){
            return array[index];
        }
        public void set(int index,double value){
            array[index]=value;
        }
        /*получение размера */
        public void remove(double val){
          //  remove(indexOf(val));
        }
        public void replace(double oloVal){
           // set(indexOf(oloVal), newVal );
        }



    }
