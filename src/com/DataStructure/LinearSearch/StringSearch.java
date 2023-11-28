package com.DataStructure.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String str = "myworld";
        char target = 'w';

        SearchString result = searchString(str, target);

        if (result.index != -1) {
            System.out.println("Character '" + target + "' found at index " + result.index +
                    " with string value '" + result.value + "'");
        } else {
            System.out.println("Character '" + target + "' not found in the string.");
        }
    }

    private static SearchString searchString(String str, char target) {
        SearchString result = new SearchString();

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                result.index = i;
                result.value = str.charAt(i);
                result.target = target;
                return result;
            }
        }

        result.index = -1;
        return result;
    }

    private static class SearchString {
        int index;
        char value;
        char target;
    }
}
