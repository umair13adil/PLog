package com.blackbox.plog.elk

data class MetaInfo(
        /**App**/
        var appId: String = "",
        var appName: String = "",
        var appVersion: String = "",

        /**Environment**/
        var deviceId: String = "",
        var environmentId: String = "",
        var environmentName: String = "",
        var geoLocation: String = "",
        var organizationId: String = "",
        var language: String = "",

        /**User**/
        var userId: String = "",
        var userName: String = "",
        var userEmail: String = "",

        /**Device**/
        var deviceSerial: String = "",
        var deviceBrand: String = "",
        var deviceName: String = "",
        var deviceManufacturer: String = "",
        var deviceModel: String = "",
        var deviceSdkInt: String = "",

        /**Log**/
        internal var elkLog: ELKLog? = null
)