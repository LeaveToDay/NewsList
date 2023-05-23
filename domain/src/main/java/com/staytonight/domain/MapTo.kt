package com.staytonight.domain

interface MapTo<N, M> {
    fun mapTo(): N
}