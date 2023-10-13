// INV: FIFO (First in - first out)
//      0 <= size
//      queue[head]..queue[tail] - queue
public class ArrayQueue {
    private final ArrayQueueModule queue;

    public ArrayQueue() {
        this.queue = new ArrayQueueModule();
    }

    // PRE: size > 0
    // POST: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail] - immutable
    public Object dequeue() {
        return queue.dequeue();
    }

    // PRE:  size > 0
    // POST: R = queue[head]
    //       queue - immutable
    public Object element() {
        return queue.element();
    }

    // PRE:  None
    // POST: queue[tail] = element
    //       queue[head]..queue[tail-1] - immutable
    public void enqueue(Object o) {
        queue.enqueue(o);
    }

    // PRE:  None
    // POST: queue - immutable
    //       R = (head == tale)
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // PRE:  None
    // POST: size == 0
    public void clear() {
        queue.clear();
    }
}