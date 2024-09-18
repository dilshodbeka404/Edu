package enums;


import lombok.Getter;

@Getter
public enum ApplicationUserType {
    APAY_ADMIN {
        @Override
        public String getName(LanguageEnum language) {
            if (language == LanguageEnum.UZ) {
                return "Admin Web App";
            }
            return "Веб-приложение администратора";
        }
    },
    WEB_BUSINESS {
        @Override
        public String getName(LanguageEnum language) {
            if (language == LanguageEnum.UZ) {
                return "Biznes Web App";
            }
            return "Веб для бизнеса";
        }
    },
    ANDROID_BUSINESS {
        @Override
        public String getName(LanguageEnum language) {
            if (language == LanguageEnum.UZ) {
                return "Biznes Android App";
            }
            return "Андроид для бизнеса";
        }
    },
    ANDROID_CLIENT {
        @Override
        public String getName(LanguageEnum language) {
            if (language == LanguageEnum.UZ) {
                return "Client Android App";
            }
            return "Андроид для клиента";
        }
    },
    IOS_CLIENT {
        @Override
        public String getName(LanguageEnum language) {
            if (language == LanguageEnum.UZ) {
                return "Client IOS App";
            }
            return "IOS для клиента";
        }
    };

    private final String name;
    private final String code;

    ApplicationUserType() {
        this.code = this.name();
        this.name = this.getName();
    }

    public abstract String getName(LanguageEnum language);


}
