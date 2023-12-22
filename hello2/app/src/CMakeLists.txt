cmake_minimum_required(VERSION 3.24)
project(hello2)

set(CMAKE_CXX_STANDARD 17)
add_library(hello2 SHARED hello.cpp)