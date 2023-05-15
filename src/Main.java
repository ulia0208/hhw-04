import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex2();

    }
    static void ex0(){
            /*Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
    Постараться не обращаться к листу по индексам.*/

        LinkedList<String>list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("Список 1: " + list);
        LinkedList<String> reversedList =reverseList(list);
        System.out.println("Список 2: " + reversedList);



        }

     public static LinkedList<String> reverseList(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            String listEl=list.get(i);
            //System.out.println("listEl "+listEl);
            reversedList.add(listEl);
        }
        return reversedList;
        

    }


            /*Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.*/
    static void ex1(){
        LinkedList<Integer> qu = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            enqueue(qu, randNum());
        }

        System.out.println(qu);


        System.out.println(dequeue(qu));
        System.out.println(qu);

        System.out.println(first(qu));
        System.out.println(qu);



    }

    static void enqueue(LinkedList<Integer>qu, int num){
        qu.addLast(num);

    }


    static int dequeue(LinkedList<Integer>qu){
        int num = qu.get(0);
        qu.remove(0);
        return num;
    }

    static int first(LinkedList<Integer> qu){
        int num = qu.get(0);
        return num;
    }

    static int randNum(){
        double n = Math.random()*99;
        int num = (int)n;
        return num;


    }




    static void ex2(){
           /* Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
           Используйте итератор
            */
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            list.add(randNum());

        }
        System.out.println(list);


        Iterator<Integer>iterator = list.iterator();


        while(iterator.hasNext()){
            sum+=iterator.next();

        }
        System.out.println(sum);




    }






}