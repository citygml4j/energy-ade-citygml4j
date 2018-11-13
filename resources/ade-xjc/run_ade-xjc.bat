@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  Windows start script for converting the NoiseADE
@rem
@rem ##########################################################################

set OUTPUT="src-gen"
set PACKAGE="org.sig3d.citygml._2.energy._1"
set BINDING="binding.xjb"
set SCHEMA="EnergyADE.xsd"
set PLUGINS="-Xnamespace-prefix"

call ..\bin\ade-xjc.bat %PLUGINS% -clean -output %OUTPUT% -package %PACKAGE% -binding %BINDING% %SCHEMA%