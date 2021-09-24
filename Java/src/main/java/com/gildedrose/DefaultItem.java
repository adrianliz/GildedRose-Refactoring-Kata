package com.gildedrose;

final class DefaultItem extends UpdatableItem {
    private static final int DOUBLE_QUALITY_DECREASE_SELL_IN_THRESHOLD = 0;

    DefaultItem(Item item) {
        super(item);
    }

    @Override
    void update() {
        decreaseSellIn();
        decreaseQuality();

        if (sellIn() < DOUBLE_QUALITY_DECREASE_SELL_IN_THRESHOLD) {
            decreaseQuality();
        }
    }
}
