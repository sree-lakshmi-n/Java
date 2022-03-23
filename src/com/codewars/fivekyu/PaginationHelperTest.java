// PaginationHelper
// PaginationHelper class is a utility class helpful for querying paging information related to an array.
// https://www.codewars.com/kata/515bb423de843ea99400000a
package com.codewars.fivekyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PaginationHelper<I>{
    private List<I> collection = new ArrayList<>();;
    private int itemsPerPage;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection.addAll(collection);
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     * @return
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int)Math.ceil((double)itemCount()/itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int noOfPages = pageCount();
        if(pageIndex < 0 || pageIndex > noOfPages-1)
            return -1;
        if(pageIndex == noOfPages-1)
            return (int)Math.ceil((double)itemCount()%itemsPerPage);
        return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex < 0 || itemIndex >= itemCount())
            return -1;
        return (int)Math.floor((double)(itemIndex+1)/itemsPerPage);
    }
}
public class PaginationHelperTest {
    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.itemCount());
        System.out.println(helper.pageCount());
        System.out.println(helper.pageItemCount(1));
        System.out.println(helper.pageItemCount(2));
        System.out.println(helper.pageIndex(5));
        System.out.println(helper.pageIndex(2));
        System.out.println(helper.pageIndex(20));
        System.out.println(helper.pageIndex(-10));
    }
}