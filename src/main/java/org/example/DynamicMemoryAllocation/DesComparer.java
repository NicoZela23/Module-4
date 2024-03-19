package org.example.DynamicMemoryAllocation;

public class DesComparer implements IBlockComparer{
    @Override
    public int compare(MemoryBlock block1, MemoryBlock block2) {
        return block2.getSize()-block1.getSize();
    }
}
