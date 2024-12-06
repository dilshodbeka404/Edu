#!/bin/bash

# 2 hafta orqaga borib, yil va hafta (ISO 8601) formatini olish
# reult => terminal-prod-log-2024-42
index="terminal-prod-log-$(date -d '2 weeks ago' +'%Y-%V')"

# DELETE so'rovi
# curl -X DELETE "http://localhost:9200/terminal-prod-log-2024-42"
curl -X DELETE "http://localhost:9200/$index"