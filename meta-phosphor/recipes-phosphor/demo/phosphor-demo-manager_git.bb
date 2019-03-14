SUMMARY = "Phosphor Time Manager daemon"
DESCRIPTION = "Daemon to get system time management"
HOMEPAGE = "http://github.com/deanyin123/phosphor-demo-state-manager"
PR = "r1"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
inherit autotools pkgconfig pythonnative
inherit obmc-phosphor-dbus-service

DEPENDS += "autoconf-archive-native"
DEPENDS += "phosphor-mapper"
DEPENDS += "systemd"
DEPENDS += "sdbusplus"
DEPENDS += "sdbusplus-native"
DEPENDS += "phosphor-logging"
DEPENDS += "phosphor-dbus-interfaces"
RDEPENDS_${PN} += "${VIRTUAL-RUNTIME_obmc-settings-mgmt}"
RDEPENDS_${PN} += "network"
RDEPENDS_${PN} += "libmapper"
RDEPENDS_${PN} += "libsystemd"
RDEPENDS_${PN} += "sdbusplus"
RDEPENDS_${PN} += "phosphor-dbus-interfaces"

SRC_URI += "https://github.com/deanyin123/phosphor-demo-manager-master"
SRCREV = "17f6c2612a0b7bf73caeef4103eeff29d3962aab"
PV = "1.0+git${SRCPV}"
S = "${WORKDIR}/git"

DBUS_SERVICE_${PN} += "xyz.openbmc_project.Demo.Demo.service"
