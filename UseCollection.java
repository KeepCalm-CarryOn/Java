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
       for(it = collection.iterator();it.hasNext();)            //���� ÿһ��Ԫ��
           System.out.print(it.next()+"");
       System.out.println(collection);  
       // ������δ����ڱ���ʱ�д���
       // it = collection.iterator();
       // it.forEachRemaining((obj)->System.out.print(obj+"")); // ��lambda ���ʽ ����Ԫ��
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

///List �ǳ��ȿɱ�����Ա�Collections
///����֮�䳣���Ľṹ ���� ���Խṹ�������ṹ�����ϣ�ӳ�䣩�����νṹ��ͼ�νṹ
///���Ա������ݽṹ������������ݽṹ�����顢����ջ������ �� 4�� ��������Ա�

class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s = s;
    }
    
    public String toString(){
        return super.toString()+""+s;
     
    }
    
    
    
}

/* Set ���ϲ�������� �ظ��Ķ��󣬾��������� ĳ�������Ƿ��� ĳ��set��
 * Set �� Collection ������ͬ�Ľӿڣ�Set ���ӽӿ��� SortedSet
 * ʵ������ HashSet��TreeSet �� LinkedHashSet
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








