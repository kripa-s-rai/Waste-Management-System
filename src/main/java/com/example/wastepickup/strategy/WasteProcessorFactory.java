package com.example.wastepickup.strategy;

public class WasteProcessorFactory {
    public static WasteProcessor getProcessor(String category) {
        return switch (category.toLowerCase()) {
            case "recyclable" -> new RecyclableProcessor();
            case "non-recyclable" -> new NonRecyclableProcessor();
            default -> throw new IllegalArgumentException("Unsupported category: " + category);
        };
    }
}
