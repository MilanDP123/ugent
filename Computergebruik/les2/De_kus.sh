/* https://dodona.be/nl/courses/4165/series/46398/activities/1844477503 */

mkdir images images/jpg images/png
find . -type f -name "*.jp[e]g" -not -path "./images/jpg*" -exec mv {} images/jpg/ \;
find . -type f -name "*.png" -not -path "./images/png/*" -exec mv {} images/png/ \;
