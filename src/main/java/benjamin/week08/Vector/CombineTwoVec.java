package benjamin.week08.Vector;

import java.util.Vector;

public class CombineTwoVec {
    public static void main(String[] args) {

        int dim = 2000;

        Vector<Integer> vec1 = CreateVector.randVec(dim);
        Vector<Integer> vec2 = CreateVector.randVec(dim);

        CreateVector.sortDscVec(vec1);
        CreateVector.sortDscVec(vec2);

        System.out.println(vec1);
        System.out.println(vec2);

        System.out.println("Sorted Vectors in a new Vector");
        Vector<Integer> vec3 = createNewVector(vec1, vec2);
        System.out.println(vec3);
//        CreateVector.printVec(vec3);
    }

    public static Vector<Integer> createNewVector(Vector<Integer> vec1, Vector<Integer> vec2) {

        Vector<Integer> sort = new Vector<>(vec1.size() + vec2.size());

        //my Version

        int index1 = 0;
        int index2 = 0;

        while (index1 < vec1.size() && index2 < vec2.size()) {
            if (vec1.get(index1) < vec2.get(index2)) {
                sort.add(vec1.get(index1));
                index1++;
            } else {
                sort.add(vec2.get(index2));
                index2++;
            }
        }
        while (index1 < vec1.size()) {
            sort.add(vec1.get(index1));
            index1++;
        }
        while (index2 < vec2.size()) {
            sort.add(vec2.get(index1));
            index1++;
        }

        //Gyula Version

//        while (!vec1.isEmpty() && !vec2.isEmpty()) {
//            if (vec1.firstElement() < vec2.firstElement()) {
//                sort.add(vec1.firstElement());
//                vec1.remove(0);
//            } else {
//                sort.add(vec2.firstElement());
//                vec2.remove(0);
//            }
//        }
//        while (!vec1.isEmpty()) {
//            sort.add(vec1.firstElement());
//            vec1.remove(0);
//        }
//        while (!vec2.isEmpty()) {
//            sort.add(vec2.firstElement());
//            vec2.remove(0);
//        }
//
//        return sort;
//    }


        //Selection sort

//        sort.addAll(vec1);
//        sort.addAll(vec2);
//
//        for (int i = 0; i < sort.size(); i++) {
//            int min = i;
//            for (int j = i + 1; j < sort.size(); j++) {
//                if (sort.get(j) < sort.get(min)) {
//                    min = j;
//                }
//            }
//            Integer temp = sort.get(i);
//            sort.set(i, sort.get(min));
//            sort.set(min, temp);
//        }
        return sort;
    }
}

