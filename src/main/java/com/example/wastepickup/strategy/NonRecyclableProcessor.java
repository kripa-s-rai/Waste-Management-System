package com.example.wastepickup.strategy;

import com.example.wastepickup.model.WastePickup;

public class NonRecyclableProcessor implements WasteProcessor {
    @Override
    public void process(WastePickup pickup, String processedBy) {
        pickup.setCategory("Non-Recyclable");
        pickup.setProcessedBy(processedBy);
        pickup.setStatus("Sent to Disposal");
    }
}
