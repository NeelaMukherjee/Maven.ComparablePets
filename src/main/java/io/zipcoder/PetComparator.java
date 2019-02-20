package io.zipcoder;
import java.util.Comparator;





    public class PetComparator implements Comparator<Pet> {

        public int compare(Pet a, Pet b) {
            int result = compareTypes(a, b);

            if (result == 0) {
                result = a.getName().compareTo(b.getName());
            }
            return result;
        }

        @SuppressWarnings("Duplicates")
        private int compareTypes(Pet firstPet, Pet secondPet) {
            int result = 0;

            if (firstPet instanceof Dog) {
                if (!(secondPet instanceof Dog)) {
                    result = -1;
                }
            } else if (firstPet instanceof Cat) {
                if (secondPet instanceof Dog) {
                    result = 1;
                } else if (secondPet instanceof Horse) {
                    result = -1;
                }
            } else if (firstPet instanceof Horse) {
                if (!(secondPet instanceof Horse)) {
                    result = 1;
                }
            }

            return result;
        }
    }


