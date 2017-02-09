@echo off
setlocal EnableDelayedExpansion
:ProgStart
(
set /a var = !random! * 4 / 32768
goto target!var!
)