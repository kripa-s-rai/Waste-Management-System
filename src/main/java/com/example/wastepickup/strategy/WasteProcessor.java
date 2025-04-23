package com.example.wastepickup.strategy;

import com.example.wastepickup.model.WastePickup;

public interface WasteProcessor {
    void process(WastePickup pickup, String processedBy);
}
