package calculator;

import java.util.LinkedList;

public abstract class Calculator {
    LinkedList<Double> results;

    public Calculator() {
        results = new LinkedList<Double>();
    }

    public double resultGetter(int index) { // 해당 index의 값을 반환해준다.
        return results.get(index);
    }

    public double resultGetLast() { // result list의 마지막 값을 반환해준다.
        return results.getLast();
    }

    public void resultSetter(int index, double element) { // result list에 해당 index에 element 값을 넣어준다.
        results.set(index, element);
    }

    public int resultSize() { // result의 크기를 반환해준다.
        return results.size();
    }

    public void removeResult() { // result list에서 첫번째 인덱스를 삭제한다.
        results.removeFirst();
    }

    public void inquiryResults() {
        System.out.print("[ ");
        for (double d : results)
            System.out.print(d + " ");
        System.out.println("]");
    }
}