import com.bro.DynamicArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicArrayTest {

    DynamicArray dynamicArray;

    @BeforeEach
    void setUp(){
        dynamicArray= new DynamicArray();
        dynamicArray.add("one");
        dynamicArray.add("two");
        dynamicArray.add("three");
        dynamicArray.add("five");
        dynamicArray.add("six");
        dynamicArray.add("seven");
    }

    @Test
    @DisplayName("Test for add")
    void testAdd(){
        dynamicArray.add("eight");
        assertEquals(7,dynamicArray.getSize(),"Element added successfully.");
    }

    @Test
    @DisplayName("Test for removing element")
    void remove(){
        dynamicArray.remove();
        assertEquals(5,dynamicArray.getSize());
    }

    @Test
    @DisplayName("Test for inserting element")
    void testInsertAt(){
        dynamicArray.insertAt(3,"four");
        dynamicArray.insertAt(0,"zero");
        assertEquals("four",dynamicArray.getValue(4));
        assertEquals("zero",dynamicArray.getValue(0));
    }

    @Test
    @DisplayName("Test : remove element at ")
    void testRemoveAt(){
        System.out.println(dynamicArray);
        dynamicArray.removeAt(1);
        assertEquals(5,dynamicArray.getSize());
        System.out.println(dynamicArray);
    }

    @Test
    @DisplayName("Delete element")
    void testDelete(){
        dynamicArray.delete("one");
        assertEquals(5,dynamicArray.getSize());
        System.out.println(dynamicArray);
    }

    @Test
    @DisplayName("Search elements")
    void testSearch(){
        assertEquals(0,dynamicArray.search("one"));
    }
}
