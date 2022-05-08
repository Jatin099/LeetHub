/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
 Stack<ListIterator<NestedInteger>> stack;
    NestedInteger cache;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        stack.push(nestedList.listIterator());
    }

    @Override
    public Integer next() {
        return cache.getInteger();
    }

    @Override
    public boolean hasNext() {
        while (true) {
            if (stack.isEmpty()) break;
            if (!stack.peek().hasNext()) {
                stack.pop();
                continue;
            }
            
            cache = stack.peek().next();
            if (!cache.isInteger()) {
                stack.push(cache.getList().listIterator());
                continue;
            }
            
            return true;
        }
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */