inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-3.10:"

KBRANCH_odroid-ux3 ?= "odroidxu3-3.10.y"

SRCREV_odroid-ux3 ?= "30cd82480f257905c418b32735425585b15cebdd"

SRC_URI = "git://github.com/hardkernel/linux.git;branch=${KBRANCH}"

SRC_URI += "file://defconfig"

LINUX_VERSION_odroid-ux3 ?= "3.10.81"
LINUX_VERSION_EXTENSION_odroid-ux3 ?= "odroid-ux3"

PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE_odroid-ux3 = "odroid-ux3"
