package org.example.DynamicMemoryAllocation;


import java.util.List;

public class FitAlgorithm implements IAllocationAlgorithm{
    private BlockSorter blockSorter ;
    public FitAlgorithm(BlockSorter blockSorter){
        this.blockSorter = blockSorter;
    }
    @Override
    public MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size) {
        List<MemoryBlock> emptyBlocks = EmptyBlocks.emptyBlocks(blocks);

        blockSorter.sort(emptyBlocks);

        for (MemoryBlock b : emptyBlocks) {
            if (b.getSize() >= size) {
                return b;
            }
        }
        return null;
    }
}
