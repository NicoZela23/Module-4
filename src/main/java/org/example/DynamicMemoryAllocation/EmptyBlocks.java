package org.example.DynamicMemoryAllocation;

import java.util.ArrayList;
import java.util.List;

public class EmptyBlocks {
    public static List<MemoryBlock> emptyBlocks(List<MemoryBlock> blocks){
        List<MemoryBlock> emptyBlocks = new ArrayList<MemoryBlock>();
        for (MemoryBlock b : blocks) {
            if (b.IsFree()) {
                emptyBlocks.add(b);
            }
        }
        return emptyBlocks;
    }
}
