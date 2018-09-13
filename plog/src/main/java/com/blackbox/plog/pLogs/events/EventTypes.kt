package com.blackbox.plog.pLogs.events

enum class EventTypes(var data: String) {

    PLOGS_EXPORTED("1"),
    DATA_LOGS_EXPORTED("2"),
    LOGS_CONFIG_FOUND("3"),
    NEW_ERROR_REPORTED("4"),
    NEW_EVENT_DIRECTORY_CREATED("5"),
    NEW_LOG_FILE_CREATED("6"),
    DELETE_LOGS("7"),
    DELETE_EXPORTED_FILES("8"),
    AUTO_EXPORT_PERIOD_COMPLETED("9"),
    LOG_TYPE_EXPORTED("10"),

}
