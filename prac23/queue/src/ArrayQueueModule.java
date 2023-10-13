// INV: FIFO (First in - first out)
//      0 <= size <= q.length - 1
//      queue[head]..queue[tail] - queue
//      q.length = 2**x
public class ArrayQueueModule {
    private static final int START_CAPACITY = 16;
    private Object[] q;
    private int head = 0;
    private int tail = 0;

    // PRE: queue - null
    // POST: queue.size = 0;
    //       q.length = 16;
    public ArrayQueueModule() {
        q = new Object[START_CAPACITY];
    }

    // PRE:  size > 0
    // POST: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail]
    public Object dequeue() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        Object r = q[head++];
        if (head == tail) head = 0;
        return r;
    }

    // POST: R = (head == tail == 0)
    public boolean isEmpty() {
        return (head == tail && head == 0);
    }

    // POST: queue[tail] = element
    //       queue[head]..queue[tail-1]
    public void enqueue(Object element) {
        q[tail++] = element;
        if (tail == q.length) resize(q.length * 2);
    }

    // Pre: none;
    // Post: q.length == nSize;
    //       queue - immutable;
    private void resize(int nSize) {
        Object[] nq = new Object[nSize];
        System.arraycopy(q, 0, nq, 0, q.length);
        q = nq;
    }

    // PRE:  size > 0
    // POST: R = queue[head]
    //       queue - immutable
    public Object element() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return q[head];
    }

    // POST: size == 0
    //       q.length = 16
    public void clear() {
        head = tail = 0;
        q = new Object[START_CAPACITY];
    }
}