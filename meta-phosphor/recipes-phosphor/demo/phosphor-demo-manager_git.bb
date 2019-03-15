SUMMARY = "Phosphor Time Manager Manager"
DESCRIPTION = "get system time"
HOMEPAGE = "https://github.com/deanyin123/phosphor-demo-manager-master"
PR = "r1"
PV = "1.0+git${SRCPV}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

inherit autotools pkgconfig
inherit obmc-phosphor-dbus-service
inherit systemd

DEPENDS += "autoconf-archive-native"
DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
RDEPENDS_${PN} += "libsystemd"
DEPENDS += "phosphor-logging"


SRC_URI += "git://github.com/deanyin123/phosphor-demo-manager-master"
SRCREV = "fb0865eaf1234af75525f2c0acd56fdca64ea818"
S = "${WORKDIR}/git"

DBUS_SERVICE_${PN} += "xyz.openbmc_project.Demo.Demo.service"
