def isValid(s):
    arr = []
    for c in s:
        match c:
            case "(" | "{" | "[":
                arr.append(c)
            case "}":
                if not arr or arr.pop() != "{":
                    return False;
                break;
            case ")":
                if not arr or arr.pop() != "(":
                    return False;
                break
            case "]":
                if not arr or arr.pop() != "[":
                    return False
                break
        
    return len(arr) == 0
print(
isValid("[]"))