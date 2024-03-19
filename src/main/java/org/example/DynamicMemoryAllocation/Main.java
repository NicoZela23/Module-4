package org.example.DynamicMemoryAllocation;

public class Main {
    public static void main(String[] args) {
        IMemoryAllocator allocator=new MemoryAllocator(1000,new FitAlgorithm(new BlockSorter(new DesComparer())));

        allocator.Allocate("A",50);
        allocator.Allocate("B",150);
        allocator.Allocate("C",120);
        allocator.Allocate("D",350);
        allocator.Allocate("E",60);
        allocator.Allocate("F",152);
        allocator.Allocate("G",18);

        allocator.ShowMemory();
        allocator.DeAllocate("C");
        allocator.DeAllocate("E");
        allocator.ShowMemory();
        allocator.Allocate("H",59);
        allocator.ShowMemory();
    }
}
