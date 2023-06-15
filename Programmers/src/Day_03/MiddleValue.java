package Day_03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MiddleValue {
    public static void main(String[] args) {
        // 1. array 주어진 값 count HashMap 생성
        // 2. find max value in map
        // 3. not equal max value = delete key

        int[] array = {1,2,3,3,3,4};
        Map<Integer, Integer> map = new HashMap<>();

        // 1
        for(int num : array){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        // 2
        int maxValue = map.values().stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        System.out.println("Max Value : " + maxValue);
        List<Map.Entry<Integer, Integer>> modeList = map.entrySet().stream().filter(x -> x.getValue() == maxValue).collect(Collectors.toList());

        System.out.println(modeList.size() > 1 ? -1 : modeList.get(0).getKey());


        List<Integer> list = Arrays.asList(1,2,3);

        for(int i =1; i <=10; i+=2){
            list.add(i);
        }





//        //3
//        Iterator<Integer> itMap = map.values().iterator();
//        while(itMap.hasNext()){
//            if(itMap.next() < maxValue){
//                itMap.remove();
//            }
//        }
//
//        System.out.println(map.keySet());
    }
}
