package org.example.DynamicMemoryAllocation;

import java.util.List;

public interface IAllocationAlgorithm {
    MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size);
}
