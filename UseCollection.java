//package org.UseCollection;
import java.util.*;
public class UseCollection{
    
    public static void main(String[] args){
        
/*        Collection<String>collection = new ArrayList<String>(Arrays.asList("A","B","C","D","E")); 
       Iterator it;
       String[] strArray = {"F","G","H","I"};
       System.out.println(collection);    
       collection.addAll(Arrays.asList(strArray)); 
       Collections.addAll(collection,"J","K","L","M");
       System.out.println(collection);  
       for(it = collection.iterator();it.hasNext();)            //迭代 每一个元素
           System.out.print(it.next()+"");
       System.out.println(collection);  
       // 下面这段代码在编译时有错误
       // it = collection.iterator();
       // it.forEachRemaining((obj)->System.out.print(obj+"")); // 用lambda 表达式 遍历元素
       // System.out.println(); */
       
       // // List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4,new StringAddress("Hello")));
       // System.out.println(list);
       // Collections.fill(list,new StringAddress("world"));
       // System.out.println(list);
       // List<String> list1 = Arrays.asList(new String[] {"spring","summer","autumn","winter"});
       // Collections.sort(list1);
       // System.out.println(list1);
       // System.out.println(Arrays.toString(list1.toArray())); 
       
       Collection c = new HashSet();
       c.add(new Person("Jack",20));
       c.add(new Person("Jack",20));
       System.out.println(c.size());
       System.out.
       
    }
    
    
}

///List 是长度可变的线性表，Collections
///数据之间常见的结构 包括 线性结构，关联结构（集合，映射），树形结构，图形结构
///线性表是数据结构中最基本的数据结构，数组、链表、栈、队列 是 4种 最常见的线性表

class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s = s;
    }
    
    public String toString(){
        return super.toString()+""+s;
     
    }
    
    
    
}

/* Set 集合不允许放入 重复的对象，就用来查找 某个对象是否在 某个set中
 * Set 和 Collection 具有相同的接口，Set 的子接口是 SortedSet
 * 实现类有 HashSet，TreeSet 与 LinkedHashSet
 */

class Person{
    private String name;
    private int age;
    public Person(String name,int age);
    
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person)obj;
        return (name.equals(p.name))&&(age == p.age);
        }
            
        return super.equals(obj);
    
    }
    
    public int hashCode(){
        int i;
        i = (name == null?0:name.hashCode());
        i = 10*i +age;
        return i;
    }
    
    
    
    
    
}








