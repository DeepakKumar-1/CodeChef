//package com.company.StackAndQueues;
//
//import com.company.LinkedLists.LinkedListNode;
//
//abstract class Animal{
//    private int order;
//    protected String name;
//    public Animal(String n){
//        name = n;
//    }
//    public void setOrder(int odr){
//        order = odr;
//    }
//    public int getOrder(){
//        return order;
//    }
//    public boolean isOlder(Animal a){
//        return this.order < a.getOrder();
//    }
//}
//
//class AnimalQueue{
//    LinkedListNode<Dog> dogs = new LinkedListNode<>();
//    LinkedListNode<Cat> dogs = new LinkedListNode<>();
//    private int order = 0;
//
//    public void enqueue(Animal a){
//        a.setOrder(order);
//        order++;
//
//        if(a instanceof Dog) dogs.addLast((Dog)a);
//        else if(a instanceof Cat) dogs.addLast((Cat)a);
//    }
//
//    public Animal dequeueAny(){
//        if(dogs.size() == 0){
//            return dequeueCats;
//        } else if(cats.size() == 0){
//            return dequeueDogs();
//        }
//
//        Dog dog = dogs.peek();
//        Cat cat = cats.peek();
//
//        if(dog.isOlder(cat)){
//            return dequeueDogs();
//        } else{
//            return dequeueCats();
//        }
//    }
//
//    public Dog dequeueDogs(){
//        return dogs.poll();
//    }
//    public cat dequeueCats(){
//        return cats.poll();
//    }
//}
//
//class Dog extends Animal{
//    public Dog(String n) { super(n); }
//}
//class Cat extends Animal{
//    public Cat(String n) { super(n); }
//}
//
//
//public class AnimalShelter {
//}
