package org.example.DynamicMemoryAllocation;

import java.util.List;

public class BlockSorter {
    IBlockComparer comparer;
    public BlockSorter(IBlockComparer comparer){
        this.comparer = comparer;
    }
    public void  sort(List<MemoryBlock> emptyBlocks) {
        for (int i = 0; i < emptyBlocks.size() - 1; i++){
            for (int j = 0; j < emptyBlocks.size() - i - 1; j++){
                if (comparer.compare(emptyBlocks.get(j), emptyBlocks.get(j+1)) > 0){
                    MemoryBlock temp = emptyBlocks.get(j);
                    emptyBlocks.set(j, emptyBlocks.get(j + 1));
                    emptyBlocks.set(j + 1, temp);
                }
            }
        }

    }
}
