/* https://dodona.be/nl/courses/4165/series/46398/activities/1863942083 */

find . -type f -newermt "$(date +%Y-%m-%d)" -exec sh -c 'cp "$1" "$1.BACKUP"' _ {} \;
