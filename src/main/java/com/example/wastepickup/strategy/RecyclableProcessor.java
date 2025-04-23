package com.example.wastepickup.strategy;

import com.example.wastepickup.model.WastePickup;

public class RecyclableProcessor implements WasteProcessor {
    @Override
    public void process(WastePickup pickup, String processedBy) {
        pickup.setCategory("Recyclable");
        pickup.setProcessedBy(processedBy);
        pickup.setStatus("Processed and Sent to Recycling");
    }
}
