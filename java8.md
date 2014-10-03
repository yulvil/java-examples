java 8 changes
==============

# API modifications

## New packages
```
java.time
java.util.function
java.util.stream
```

## New classes
```
java.util.concurrent.locks.StampedLock
java.util.Base64
java.util.Optional
java.util.Spliterators

java.util.concurrent.atomic.DoubleAccumulator
java.util.concurrent.atomic.DoubleAdder
java.util.concurrent.atomic.LongAccumulator
java.util.concurrent.atomic.LongAdder
java.util.concurrent.CompletableFuture
java.util.concurrent.CountedCompleter
```

## New interfaces
```
public interface Function<T, R>
public interface Predicate<T>
public interface Spliterator<T>
public interface PrimitiveIterator<T, T_CONS> extends Iterator<T>
```

## New annotations
```
public @interface FunctionalInterface {}
```

## Iterator
```
default void remove()
default void forEachRemaining(Consumer<? super E> action)
```

## Iterable
```
default void forEach(Consumer<? super T> action)
default Spliterator<T> spliterator()
```

## Collection
```
default boolean removeIf(Predicate<? super E> filter)
default Spliterator<E> spliterator()
default Stream<E> stream()
default Stream<E> parallelStream()
```

## List
```
default void replaceAll(UnaryOperator<E> operator)
default void sort(Comparator<? super E> c)
default Spliterator<E> spliterator()
```

## Map
```java
default V getOrDefault(Object key, V defaultValue)
default void forEach(BiConsumer<? super K, ? super V> action)
default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
default V putIfAbsent(K key, V value)
default boolean remove(Object key, Object value)
default boolean replace(K key, V oldValue, V newValue)
default V replace(K key, V value)
default V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
default V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
default V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
```

## java.util.Objects
```
public static boolean isNull(Object obj)
public static boolean nonNull(Object obj)
public static <T> T requireNonNull(T obj, Supplier<String> messageSupplier)
```

## java.util.concurrent.ConcurrentHashMap
```
public long mappingCount()
public static <K> KeySetView<K,Boolean> newKeySet()
public static <K> KeySetView<K,Boolean> newKeySet(int initialCapacity)
public void forEach(long parallelismThreshold, BiConsumer<? super K,? super V> action)
public <U> void forEach(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer, Consumer<? super U> action)
public <U> U search(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> searchFunction)
public <U> U reduce(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer)
public double reduceToDouble(long parallelismThreshold, ToDoubleBiFunction<? super K, ? super V> transformer, double basis, DoubleBinaryOperator reducer)
public long reduceToLong(long parallelismThreshold, ToLongBiFunction<? super K, ? super V> transformer, long basis, LongBinaryOperator reducer)
public int reduceToInt(long parallelismThreshold, ToIntBiFunction<? super K, ? super V> transformer, int basis, IntBinaryOperator reducer)
public void forEachKey(long parallelismThreshold, Consumer<? super K> action) public <U> void forEachKey(long parallelismThreshold, Function<? super K, ? extends U> transformer, Consumer<? super U> action)
public <U> U searchKeys(long parallelismThreshold, Function<? super K, ? extends U> searchFunction)
public K reduceKeys(long parallelismThreshold, BiFunction<? super K, ? super K, ? extends K> reducer)
public <U> U reduceKeys(long parallelismThreshold, Function<? super K, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer)
public double reduceKeysToDouble(long parallelismThreshold, ToDoubleFunction<? super K> transformer, double basis, DoubleBinaryOperator reducer)
public long reduceKeysToLong(long parallelismThreshold, ToLongFunction<? super K> transformer, long basis, LongBinaryOperator reducer)
public int reduceKeysToInt(long parallelismThreshold, ToIntFunction<? super K> transformer, int basis, IntBinaryOperator reducer)
public void forEachValue(long parallelismThreshold, Consumer<? super V> action)
public <U> void forEachValue(long parallelismThreshold, Function<? super V, ? extends U> transformer, Consumer<? super U> action)
public <U> U searchValues(long parallelismThreshold, Function<? super V, ? extends U> searchFunction)
public V reduceValues(long parallelismThreshold, BiFunction<? super V, ? super V, ? extends V> reducer)
public <U> U reduceValues(long parallelismThreshold, Function<? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer)
public double reduceValuesToDouble(long parallelismThreshold, ToDoubleFunction<? super V> transformer, double basis, DoubleBinaryOperator reducer)
public long reduceValuesToLong(long parallelismThreshold, ToLongFunction<? super V> transformer, long basis, LongBinaryOperator reducer)
public int reduceValuesToInt(long parallelismThreshold, ToIntFunction<? super V> transformer, int basis, IntBinaryOperator reducer)
public void forEachEntry(long parallelismThreshold, Consumer<? super Map.Entry<K,V>> action)
public <U> void forEachEntry(long parallelismThreshold, Function<Map.Entry<K,V>, ? extends U> transformer, Consumer<? super U> action)
public <U> U searchEntries(long parallelismThreshold, Function<Map.Entry<K,V>, ? extends U> searchFunction)
public Map.Entry<K,V> reduceEntries(long parallelismThreshold, BiFunction<Map.Entry<K,V>, Map.Entry<K,V>, ? extends Map.Entry<K,V>> reducer)
public <U> U reduceEntries(long parallelismThreshold, Function<Map.Entry<K,V>, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer)
public double reduceEntriesToDouble(long parallelismThreshold, ToDoubleFunction<Map.Entry<K,V>> transformer, double basis, DoubleBinaryOperator reducer)
public long reduceEntriesToLong(long parallelismThreshold, ToLongFunction<Map.Entry<K,V>> transformer, long basis, LongBinaryOperator reducer)
public int reduceEntriesToInt(long parallelismThreshold, ToIntFunction<Map.Entry<K,V>> transformer, int basis, IntBinaryOperator reducer)
```

## java.util.Comparator
```
default Comparator<T> reversed()
default Comparator<T> thenComparing(Comparator<? super T> other)
default <U> Comparator<T> thenComparing( Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
default <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor)
default Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor)
default Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor)
default Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor)
public static <T extends Comparable<? super T>> Comparator<T> reverseOrder()
public static <T extends Comparable<? super T>> Comparator<T> naturalOrder()
public static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator)
public static <T> Comparator<T> nullsLast(Comparator<? super T> comparator)
public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor)
public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor)
public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor)
public static<T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor)
```

# java.lang.Long
```
public static String toUnsignedString(long i, int radix)
public static String toUnsignedString(long i)
public static long parseUnsignedLong(String s, int radix) throws NumberFormatException
public static long parseUnsignedLong(String s) throws NumberFormatException
public static int hashCode(long value)
public static int compareUnsigned(long x, long y)
public static long divideUnsigned(long dividend, long divisor)
public static long remainderUnsigned(long dividend, long divisor)
public static long sum(long a, long b)
public static long max(long a, long b)
public static long min(long a, long b)
```

# java.util.Arrays
```
public static void parallelSort(byte[] a)
public static void parallelSort(byte[] a, int fromIndex, int toIndex) 
public static void parallelSort(char[] a)
public static void parallelSort(char[] a, int fromIndex, int toIndex)
...
public static <T extends Comparable<? super T>> void parallelSort(T[] a)
public static <T extends Comparable<? super T>> void parallelSort(T[] a, int fromIndex, int toIndex)
public static <T> void parallelSort(T[] a, Comparator<? super T> cmp)
public static <T> void parallelSort(T[] a, int fromIndex, int toIndex, Comparator<? super T> cmp)
public static <T> void parallelPrefix(T[] array, BinaryOperator<T> op)
public static <T> void parallelPrefix(T[] array, int fromIndex, int toIndex, BinaryOperator<T> op)
public static void parallelPrefix(long[] array, LongBinaryOperator op)
public static void parallelPrefix(long[] array, int fromIndex, int toIndex, LongBinaryOperator op)
public static void parallelPrefix(double[] array, DoubleBinaryOperator op)
public static void parallelPrefix(double[] array, int fromIndex, int toIndex, DoubleBinaryOperator op)
...
public static <T> void setAll(T[] array, IntFunction<? extends T> generator)
public static <T> void parallelSetAll(T[] array, IntFunction<? extends T> generator)
public static void setAll(int[] array, IntUnaryOperator generator)
public static void parallelSetAll(int[] array, IntUnaryOperator generator)
public static void setAll(long[] array, IntToLongFunction generator)
public static void parallelSetAll(long[] array, IntToLongFunction generator)
...
public static <T> Spliterator<T> spliterator(T[] array)
public static <T> Spliterator<T> spliterator(T[] array, int startInclusive, int endExclusive)
public static Spliterator.OfInt spliterator(int[] array)
public static Spliterator.OfInt spliterator(int[] array, int startInclusive, int endExclusive)
...
public static <T> Stream<T> stream(T[] array)
public static <T> Stream<T> stream(T[] array, int startInclusive, int endExclusive)
public static IntStream stream(int[] array)
public static IntStream stream(int[] array, int startInclusive, int endExclusive)
...
```

## java.util.Collections
```
public static <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s)
public static <K,V> NavigableMap<K,V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> m)
public static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s)
public static <K,V> NavigableMap<K,V> synchronizedNavigableMap(NavigableMap<K,V> m)
public static <E> Queue<E> checkedQueue(Queue<E> queue, Class<E> type)
public static <E> NavigableSet<E> checkedNavigableSet(NavigableSet<E> s, Class<E> type)
public static <K,V> NavigableMap<K,V> checkedNavigableMap(NavigableMap<K, V> m, Class<K> keyType, Class<V> valueType)
public static <E> SortedSet<E> emptySortedSet()
public static <E> NavigableSet<E> emptyNavigableSet()
public static final <K,V> SortedMap<K,V> emptySortedMap()
public static final <K,V> NavigableMap<K,V> emptyNavigableMap()
```

### java.lang.Boolean
```
public static int hashCode(boolean value)
public static boolean logicalAnd(boolean a, boolean b)
public static boolean logicalOr(boolean a, boolean b)
public static boolean logicalXor(boolean a, boolean b)
```

### java.lang.Byte
```
public static int hashCode(byte value)
public static int toUnsignedInt(byte x)
public static long toUnsignedLong(byte x)
```

### java.lang.Character
```
public static int hashCode(char value)
```

### java.lang.Class
```
public String toGenericString()
public String getTypeName()
public <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass)
public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass)
public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> annotationClass)
public AnnotatedType getAnnotatedSuperclass()
public AnnotatedType[] getAnnotatedInterfaces()
```

### java.lang.String
```
public static String join(CharSequence delimiter, CharSequence... elements)
public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
```

### java.lang.StringBuffer
```
synchronized StringBuffer append(AbstractStringBuilder asb)
```

### java.lang.ThreadLocal
```
public static <S> ThreadLocal<S> withInitial(Supplier<? extends S> supplier)
```

### java.lang.BitSet
```
public IntStream stream()
```

### java.util.Calendar
```
Calendar.Builder.
public static Set<String> getAvailableCalendarTypes()
public String getCalendarType()
public final Instant toInstant()
```

### java.util.Date
```
public static Date from(Instant instant)
public Instant toInstant()
```

### java.util.concurrent.Executors
```
public static ExecutorService newWorkStealingPool(int parallelism)
public static ExecutorService newWorkStealingPool()
```

### java.util.concurrent.ForkJoinPool
```
public static ForkJoinPool commonPool()
public static int getCommonPoolParallelism()
```


