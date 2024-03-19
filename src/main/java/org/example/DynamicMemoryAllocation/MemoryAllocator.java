package org.example.DynamicMemoryAllocation;

import java.util.ArrayList;
import java.util.List;

public class MemoryAllocator implements IMemoryAllocator{
    private int totalSize;
    private IAllocationAlgorithm algorithm;

    private List<MemoryBlock> blocks;

    public MemoryAllocator(int totalSize, IAllocationAlgorithm algorithm) {
        this.totalSize = totalSize;
        this.algorithm = algorithm;
        blocks=new ArrayList<MemoryBlock>();

        MemoryBlock block = new MemoryBlock();
        block.setSize(totalSize);
        blocks.add(block);
    }

    @Override
    public boolean Allocate(String objectName, int size) {
        MemoryBlock block = algorithm.GetMemoryBlock(blocks, size);

        if (block == null) {
            return false;
        }

        MemoryBlock newBlock = new MemoryBlock();
        newBlock.setSize(size);
        newBlock.setObject(objectName);
        int idxBlock = blocks.indexOf(block);
        blocks.add(idxBlock, newBlock);

        block.setSize(block.getSize() - size);
        if (block.getSize() == 0) {
            blocks.remove(block);
        }

        return true;
    }



    @Override
    public boolean DeAllocate(String objectName) {
        MemoryBlock block = SearchByName(objectName);
        if (block == null) {
            return false;
        }

        block.setObject(null);

        CheckAdjacency();
        return true;
    }

    private MemoryBlock SearchByName(String objectName) {
        for (MemoryBlock b : blocks) {
            if (objectName.equals(b.getObject())) {
                return b;
            }
        }

        return null;
    }

    private void CheckAdjacency() {
        for(int i=0;i<blocks.size() ;i++){

            if(i == blocks.size()-1) {
                return;
            }

            if (blocks.get(i).IsFree() && blocks.get(i+1).IsFree()){
                MemoryBlock currentBlock = blocks.get(i);
                currentBlock.setSize(currentBlock.getSize() + blocks.get(i+1).getSize());
                blocks.remove(i+1);
                i -= 1;
            }
        }
    }

    @Override
    public boolean IsEmpty() {
        return false;
    }

    @Override
    public boolean IsFull() {
        return false;
    }

    @Override
    public void ShowMemory() {
        for (MemoryBlock m : blocks) {
            System.out.println(m.getObject() + " " + m.getSize());
        }

        System.out.println("-----------------------");
    }
}
