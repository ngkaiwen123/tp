package seedu.duke.types;

public class Types {
    public enum SearchType {
        KEYWORD,
        UPC
    }
    public static final String SESSIONFILEPATH = "./data/InventoryData.csv";
    public enum FileHealth {
        OK,
        CORRUPT,
        MISSING
    }
    public enum EditType {
        PRICE_INCREASE,
        PRICE_DECREASE,
        RENAME,
        RECATEGORIZE,
        CHANGE_TAG,
        SOLD,
        BOUGHT
    }
}
