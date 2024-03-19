package org.example.DynamicMemoryAllocation;

public class AscComparer implements IBlockComparer{
    @Override
    public int compare(MemoryBlock block1, MemoryBlock block2) {
        return block1.getSize()-block2.getSize();
    }
}
