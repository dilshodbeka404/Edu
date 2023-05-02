package enums;

import lombok.Getter;

import java.io.Serializable;

/**
 * Powered by: Dilshod Madrahimov
 * Date: 29.07.2021 13:05
 */

@Getter
public enum LanguageEnum implements Serializable {
    UZ("uz", "O'zbek"),
    RU("ru", "Русский");

    private final String code;
    private final String name;

    LanguageEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static LanguageEnum get(String code) {
        for (LanguageEnum statusEnum : LanguageEnum.values()) {
            if (code.equals(statusEnum.getCode())) {
                return statusEnum;
            }
        }
        return getDefaultLanguage();
    }

    public static LanguageEnum getDefaultLanguage() {
        return LanguageEnum.RU;
    }
}
