java 7 changes
==============

# API modifications

## New packages

## New classes
```
java.util.Objects
```

## New interfaces
```
public interface AutoCloseable
```

## New annotations

### java.util.Objects
```java
public static boolean equals(Object a, Object b)
public static boolean deepEquals(Object a, Object b)
public static int hashCode(Object o)
public static int hash(Object... values)
public static String toString(Object o)
public static String toString(Object o, String nullDefault)
public static <T> int compare(T a, T b, Comparator<? super T> c)
public static <T> T requireNonNull(T obj)
public static <T> T requireNonNull(T obj, String message)
```

### java.lang.Boolean
```
public static int compare(boolean x, boolean y)
```

### java.lang.Byte
```
public static int compare(byte x, byte y)
```

